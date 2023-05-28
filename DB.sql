USE [WorkManagementSystem]
GO
/****** Object:  User [trello]    Script Date: 5/28/2023 9:54:21 PM ******/
CREATE USER [trello] FOR LOGIN [trello] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [trello]
GO
/****** Object:  Table [dbo].[The]    Script Date: 5/28/2023 9:54:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[The](
	[IDCard] [int] NOT NULL,
	[title] [nvarchar](255) NULL,
	[description] [nvarchar](max) NULL,
	[duedate] [datetime] NULL,
	[archived] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDCard] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

